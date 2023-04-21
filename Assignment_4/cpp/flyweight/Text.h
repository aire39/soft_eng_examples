#pragma once

#include <string>

class TextType;

class Text {
  public:
    Text() = default;
    explicit Text(std::string text);
    explicit Text(std::string text, TextType * text_type);

    void SetText(std::string text);
    void SetTextType(TextType * text_type);

    const std::string & GetText();

  private:
    std::string text;
    TextType * textType = nullptr;
};
