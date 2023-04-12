cmake_minimum_required(VERSION 3.26)
project(bridge)

# set cxx standard
set (CMAKE_CXX_STANDARD 23)
set (CMAKE_C_STANDARD 11)

if (CMAKE_BUILD_TYPE EQUAL "Debug")
    if (CMAKE_CXX_COMPILER_ID STREQUAL "GNU")
        add_compile_options("-O0")
    endif()
elseif(CMAKE_BUILD_TYPE EQUAL "Release")
    if (CMAKE_CXX_COMPILER_ID STREQUAL "GNU")
        add_compile_options("-O3")
    endif()
endif()

add_executable(bridge
        main.cpp
        MessengingApp.h
        MessageType.h
        WhatsAppMessagingApp.cpp
        TelegramMessagingApp.cpp
        FacebookMessagingApp.cpp
        TextMessage.cpp
        ImageMessage.cpp
        VideoMessage.cpp)

