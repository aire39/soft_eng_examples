#pragma once

#include "MessageType.h"

class VideoMessage : public MessageType
{
  public:
    void SendMessage() const override;
};
