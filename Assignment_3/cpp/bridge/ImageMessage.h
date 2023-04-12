#pragma once

#include "MessageType.h"

class ImageMessage : public MessageType
{
  public:
    void SendMessage() const override;
};
