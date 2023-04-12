#pragma once

#include <memory>
#include "MessengingApp.h"
#include "MessageType.h"

class WhatsAppMessagingApp : public MessengingApp
{
  public:
    WhatsAppMessagingApp() = default;
    ~WhatsAppMessagingApp() override = default;

    void ReceiveMessageFromApp(MessageType * message) override;
    void SendMessageToApp(MessageType * message, MessengingApp * app) override;
};
