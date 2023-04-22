#pragma once

#include <string>
#include <vector>

class Song;

class ISongService
{
  public:
    virtual Song * SearchById(int song_id) = 0;
    virtual std::vector<Song*> SearchByTitle(std::string title) = 0;
    virtual std::vector<Song*> SearchByAlbum(std::string album) = 0;
};
