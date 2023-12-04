cmake_minimum_required(VERSION 3.4.1)

add_library(
            NDKTool
            SHARED
            # Provides a relative path to your source file(s).
            ${CMAKE_CURRENT_SOURCE_DIR}/NDKTool.cpp)

