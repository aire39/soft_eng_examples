cmake_minimum_required(VERSION 3.20)
project(flyweight)

set(CXX_STANDARD 17)
set(C_STANDARD 11)

add_executable(flyweight
               driver.cpp
               Text.cpp
               Text.h
               TextType.cpp
               TextType.h
               Document.cpp
               Document.h
               FlyWeightText.cpp
               FlyWeightText.h)
