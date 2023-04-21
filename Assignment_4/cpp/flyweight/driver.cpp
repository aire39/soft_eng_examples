#include <iostream>
#include "Document.h"

int main(int argc, char*argv[])
{
  constexpr char document_name[] = "HelloWorldCS5800";

  std::cout << "Create text document: " << document_name << std::endl;

  Document document(document_name);
  document.AddText("Test ", FontType::Arial, 12, ColorType::Black());
  document.AddText("Done! ", FontType::Verdana, 16, ColorType::Black());

  document << " to see if this works!";
  document << std::make_tuple<>(FontType::Calibri, 18, ColorType::Black());
  document << " This text is a different size and font!";
  document << std::make_tuple<>(FontType::Verdana, 16, ColorType::Black());
  document << " This text should use an already used TextType!";

  std::cout << "save document: " << document.GetFilename() << "..." << std::endl;
  document.Save();
  std::cout << "document " << document.GetFilename() << " saved!" << std::endl;

  return 0;
}
