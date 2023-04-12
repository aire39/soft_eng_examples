#pragma once

#include <memory>
#include "MessengingApp.h"
#include "MessageType.h"

class TelegramMessagingApp : public MessengingApp
{
  public:
    TelegramMessagingApp() = default;
    ~TelegramMessagingApp() override = default;

    void ReceiveMessageFromApp(MessageType * message) override;
    void SendMessageToApp(MessageType * message, MessengingApp * app) override;
};
