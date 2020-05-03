import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call(String title, String text, String textColor) 
{
    //json='{"attachments":[{"color":"' + color + '","title":"' + title + '","text":"' + text + '","mrkdwn_in":["text","pretext"]}]}'      
    //def response = ["curl", "-X", "POST", "-H", "Content-Type: application/json", "--data", "${json}", "https://hooks.slack.com/services/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"].execute().text
    //println response    

    slackSend color: textColor, message: "Slack message"
}
