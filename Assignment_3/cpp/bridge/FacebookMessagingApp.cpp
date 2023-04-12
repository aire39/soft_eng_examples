#include "FacebookMessagingApp.h"

#include "MessageType.h"
#include <iostream>

void FacebookMessagingApp::ReceiveMessageFromApp(MessageType * message)
{
  messages.push_back(message);
  messagesReceived.push_back(message);
  std::cout << "Facebook received message!" << std::endl;
}

void FacebookMessagingApp::SendMessageToApp(MessageType * message, MessengingApp * app)
{
  std::cout << "Facebook ";
  message->SendMessage();
  messages.push_back(message);
  messagesSent.push_back(message);
  app->ReceiveMessageFromApp(message);
}
