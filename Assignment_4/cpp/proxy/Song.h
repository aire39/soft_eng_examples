#pragma once

#include "Metadata.h"

class Song
{
  public:
    Song() = default;
    explicit Song(std::string title, std::string album, int duration);

    void SetMetadata(Metadata meta_data);
    Metadata GetMetadata();

  private:
    Metadata metadata;
};
