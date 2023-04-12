#pragma once

#include <memory>
#include "MessengingApp.h"
#include "MessageType.h"

class FacebookMessagingApp : public MessengingApp
{
  public:
    FacebookMessagingApp() = default;
    ~FacebookMessagingApp() override = default;

    void ReceiveMessageFromApp(MessageType * message) override;
    void SendMessageToApp(MessageType * message, MessengingApp * app) override;
};
