import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call( String messageTitle, String messageText, String textColor) 
{
    jsonAttachement='{"attachments":[{"color":"' + textColor + '","title":"' + messageTitle + '","text":"' + messageText + '","mrkdwn_in":["text","pretext"]}]}'      

    slackSend(attachments: jsonAttachement)
}
