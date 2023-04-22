#include "SongProxyServer.h"
#include "SongServer.h"
#include "Song.h"

SongProxyServer::SongProxyServer(std::shared_ptr<SongServer> song_server)
{
  songServer = song_server;
}

Song * SongProxyServer::SearchById(int song_id)
{
  if (songServer)
  {
    songServer = std::make_shared<SongServer>();
  }

  auto song = songServer->SearchById(song_id);
  metadataCache.emplace_back(song->GetMetadata());

  return song;
}

std::vector<Song*> SongProxyServer::SearchByTitle(std::string title)
{
  if (songServer)
  {
    songServer = std::make_shared<SongServer>();
  }

  auto songs = songServer->SearchByTitle(title);

  for (auto s : songs)
  {
    metadataCache.emplace_back(s->GetMetadata());
  }

  return songs;
}

std::vector<Song*> SongProxyServer::SearchByAlbum(std::string album)
{
  if (songServer)
  {
    songServer = std::make_shared<SongServer>();
  }

  auto songs = songServer->SearchByAlbum(album);

  for (auto s : songs)
  {
    metadataCache.emplace_back(s->GetMetadata());
  }

  return songs;
}

void SongProxyServer::SetSongServer(std::shared_ptr<SongServer> song_server)
{
  songServer = song_server;
}

std::shared_ptr<SongServer> SongProxyServer::GetSongServer()
{
  return songServer;
}

std::vector<Metadata> SongProxyServer::GetMetadataCache()
{
  return metadataCache;
}
