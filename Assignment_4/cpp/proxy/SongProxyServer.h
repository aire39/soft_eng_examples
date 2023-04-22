#pragma once

#include <memory>

#include "ISongService.h"
#include "Metadata.h"
class SongServer;
class Song;

class SongProxyServer : public ISongService
{
  public:
    SongProxyServer() = default;
    SongProxyServer(std::shared_ptr<SongServer> song_server);

    Song * SearchById(int song_id) override;
    std::vector<Song*> SearchByTitle(std::string title) override;
    std::vector<Song*> SearchByAlbum(std::string album) override;

    void SetSongServer(std::shared_ptr<SongServer> song_server);
    std::shared_ptr<SongServer> GetSongServer();
    std::vector<Metadata> GetMetadataCache();

  private:
    std::vector<Metadata> metadataCache;
    std::shared_ptr<SongServer> songServer;
};
