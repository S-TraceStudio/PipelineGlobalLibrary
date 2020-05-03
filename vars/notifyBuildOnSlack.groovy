import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def call( String messageText, String textColor) 
{
    slackSend color: textColor, message: messageText
}
