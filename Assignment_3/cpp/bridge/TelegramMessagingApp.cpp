#include "TelegramMessagingApp.h"

#include "MessageType.h"
#include <iostream>

void TelegramMessagingApp::ReceiveMessageFromApp(MessageType * message)
{
  messages.push_back(message);
  messagesReceived.push_back(message);
  std::cout << "Telegram received message!" << std::endl;
}

void TelegramMessagingApp::SendMessageToApp(MessageType * message, MessengingApp * app)
{
  std::cout << "Telegram ";
  message->SendMessage();
  messages.push_back(message);
  messagesSent.push_back(message);
  app->ReceiveMessageFromApp(message);
}
