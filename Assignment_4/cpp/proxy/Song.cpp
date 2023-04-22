#include "Song.h"

Song::Song(std::string title, std::string album, int duration)
{
    metadata.title = title;
    metadata.album = album;
    metadata.duration = duration;
}

void Song::SetMetadata(Metadata meta_data)
{
  metadata = meta_data;
}

Metadata Song::GetMetadata()
{
  return metadata;
}
