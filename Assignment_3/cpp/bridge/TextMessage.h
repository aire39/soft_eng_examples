#pragma once

#include "MessageType.h"

class TextMessage : public MessageType
{
  public:
    void SendMessage() const override;
};
