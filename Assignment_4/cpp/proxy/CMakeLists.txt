cmake_minimum_required(VERSION 3.20)
project(proxy)

set(CXX_STANDARD 17)
set(C_STANDARD 11)

add_executable(proxy
               driver.cpp
               Metadata.h
               Song.h
               Song.cpp
               SongServer.h
               SongServer.cpp
               SongProxyServer.h
               SongProxyServer.cpp
               ISongService.h)
