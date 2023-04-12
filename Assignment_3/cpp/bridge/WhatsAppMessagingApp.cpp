#include "WhatsAppMessagingApp.h"

#include "MessageType.h"
#include <iostream>

void WhatsAppMessagingApp::ReceiveMessageFromApp(MessageType * message)
{
  messages.push_back(message);
  messagesReceived.push_back(message);
  std::cout << "WhatsApp received message!" << std::endl;
}

void WhatsAppMessagingApp::SendMessageToApp(MessageType * message, MessengingApp * app)
{
  std::cout << "WhatsApp ";
  message->SendMessage();
  messages.push_back(message);
  messagesSent.push_back(message);
  app->ReceiveMessageFromApp(message);
}
