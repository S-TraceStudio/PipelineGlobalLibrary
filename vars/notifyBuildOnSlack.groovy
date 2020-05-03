import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call(String title, String text, String color) 
{
    json='{"attachments":[{"color":"' + color + '","title":"' + title + '","text":"' + text + '","mrkdwn_in":["text","pretext"]}]}'      
    def response = ["curl", "-k", "-X", "POST", "-H", "Content-Type: application/json", "--data", "${json}", "https://hooks.slack.com/services/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"].execute().text
    println response    
}
