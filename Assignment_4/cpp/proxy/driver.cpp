#include <iostream>
#include "SongServer.h"
#include "SongProxyServer.h"

void PrintMetadata(Metadata & metadata);

int main(int argc, char*argv[])
{
  auto song_server = std::make_shared<SongServer>();
  auto new_song = std::make_unique<Song>();
  Metadata meta;
  meta.title = "Test";
  meta.album = "Test";
  meta.duration = 200;
  new_song->SetMetadata(meta);
  song_server->AddSong(*new_song.get());

  SongProxyServer song_proxy_server(song_server);
  auto song = song_proxy_server.SearchById(0);
  auto song_metadata = song->GetMetadata();

  auto metadata_cache = song_proxy_server.GetMetadataCache();

  for (auto & cache : metadata_cache)
  {
    PrintMetadata(cache);
  }

  return 0;
}

void PrintMetadata(Metadata & metadata)
{
  std::cout << "song id: " << metadata.id << std::endl;
  std::cout << "song title: " << metadata.title << std::endl;
  std::cout << "song album: " << metadata.album << std::endl;
  std::cout << "song duration: " << metadata.duration << std::endl;
}