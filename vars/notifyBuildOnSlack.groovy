import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call(String title, String text, String color) 
{
    json='{"attachments":[{"color":"' + color + '","title":"' + title + '","text":"' + text + '","mrkdwn_in":["text","pretext"]}]}'      
    def response = ["curl", "-k", "-X", "POST", "-H", "Content-Type: application/json", "--data", "${json}", "https://hooks.slack.com/services/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"].execute().text
    println response    
}
