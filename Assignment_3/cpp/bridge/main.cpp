#include <memory>
#include <iostream>

#include "WhatsAppMessagingApp.h"
#include "TelegramMessagingApp.h"
#include "FacebookMessagingApp.h"

#include "TextMessage.h"
#include "ImageMessage.h"
#include "VideoMessage.h"

int main()
{
  auto whatsapp = std::make_unique<WhatsAppMessagingApp>();
  auto telegram = std::make_unique<TelegramMessagingApp>();
  auto facebook = std::make_unique<FacebookMessagingApp>();

  auto text_message = std::make_unique<TextMessage>();
  auto image_message = std::make_unique<ImageMessage>();
  auto video_message = std::make_unique<VideoMessage>();

  whatsapp->SendMessageToApp(text_message.get(), telegram.get());
  whatsapp->SendMessageToApp(image_message.get(), telegram.get());
  whatsapp->SendMessageToApp(video_message.get(), telegram.get());

  telegram->SendMessageToApp(text_message.get(), whatsapp.get());
  telegram->SendMessageToApp(image_message.get(), whatsapp.get());
  telegram->SendMessageToApp(video_message.get(), facebook.get());

  facebook->SendMessageToApp(text_message.get(), whatsapp.get());
  facebook->SendMessageToApp(image_message.get(), telegram.get());
  facebook->SendMessageToApp(video_message.get(), telegram.get());

  std::cout << "\nwhatsapp received these messages..." << std::endl;
  whatsapp->PrintAllReceivedMessages();

  std::cout << "\ntelegram received these messages..." << std::endl;
  telegram->PrintAllReceivedMessages();

  std::cout << "\nfacebook received these messages..." << std::endl;
  facebook->PrintAllReceivedMessages();

  return 0;
}
