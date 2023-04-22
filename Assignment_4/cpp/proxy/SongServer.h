#pragma once

#include "ISongService.h"
#include "Song.h"

class SongServer : public ISongService
{
  public:
    Song * SearchById(int song_id) override;
    std::vector<Song*> SearchByTitle(std::string title) override;
    std::vector<Song*> SearchByAlbum(std::string album) override;

    void AddSong(Song new_song);

  private:
    std::vector<Song> songs;
};