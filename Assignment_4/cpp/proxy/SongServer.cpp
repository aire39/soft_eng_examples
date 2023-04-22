#include "SongServer.h"


Song * SongServer::SearchById(int song_id)
{
  Song * r_song = nullptr;

  for(auto s : songs)
  {
    if (s.GetMetadata().id == song_id)
    {
      r_song = &s;
    }
  }

  return r_song;
}

std::vector<Song*> SongServer::SearchByTitle(std::string title)
{
  std::vector<Song *> r_song;

  for(auto s : songs)
  {
    if (s.GetMetadata().title == title)
    {
      r_song.emplace_back(&s);
    }
  }

  return r_song;
}

std::vector<Song*> SongServer::SearchByAlbum(std::string album)
{
  std::vector<Song *> r_song;

  for(auto s : songs)
  {
    if (s.GetMetadata().album == album)
    {
      r_song.emplace_back(&s);
    }
  }

  return r_song;
}

void SongServer::AddSong(Song new_song)
{
  songs.push_back(new_song);
}
