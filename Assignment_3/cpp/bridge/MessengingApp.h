#pragma once

#include <vector>
#include "MessageType.h"

class MessengingApp
{
  public:
    MessengingApp() = default;
    virtual ~MessengingApp() = default;

    void PrintAllReceivedMessages()
    {
      for (auto msg : messagesReceived)
      {
        msg->SendMessage();
      }
    }

    virtual void ReceiveMessageFromApp(MessageType * message) = 0;
    virtual void SendMessageToApp(MessageType * message, MessengingApp * app) = 0;

  protected:
    std::vector<MessageType*> messagesSent;
    std::vector<MessageType*> messagesReceived;
    std::vector<MessageType*> messages;
};
