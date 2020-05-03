import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call( String messageTitle, String messageText, String textColor) 
{
    jsonAttachement='[{"color":"' + textColor + '","title":"' + messageTitle + '","text":"' + messageText + '","mrkdwn_in":["text","pretext"]}]'      

    def attachmenPayload = [[
            fallback: "Project execution ",
            color: colorCode,
            fields:[
                [
                    title: "${project}",
                    value: "Build ",
                    short: false
                ],
                [  
                    title: "Branch",
                    value: "Branch Name",
                    short: true
                ],
                [  
                    title: "Environment",
                    value: "abc:xyz",
                    short: true
                ]
            ]
        ]]
// Send notifications



    slackSend(attachments: jsonAttachement)
}
