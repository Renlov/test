package com.pimenov.core_network_impl.mock

import com.google.gson.GsonBuilder
import com.pimenov.core_network_api.data_object.ProductDTO

val mockData = """[
  {
    "additionalParams": {},
    "availableCount": 10,
    "count": 2,
    "description": "Этот борщ сведёт вас с ума!",
    "guid": "b5f5852b-3b8c-4857-9f53-ac5c2b6a3b2f",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-j/6131838211.jpg"
    ],
    "isFavorite": false,
    "isInCart": false,
    "name": "Борщ по-домашнему",
    "price": "199",
    "rating": 4.6,
    "weight": 0.4
  },
  {
    "additionalParams": {
      "Качество": "10/10"
    },
    "availableCount": 0,
    "count": 0,
    "description": "Это очень вкусная колбаска",
    "guid": "5cbbb7d0-e9c6-4932-8d85-79313c58e465",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-u/6255350190.jpg"
    ],
    "isFavorite": true,
    "isInCart": false,
    "name": "Ваш любимый Сальчичон",
    "price": "79",
    "rating": 5,
    "weight": 0.2
  },
  {
    "additionalParams": {},
    "availableCount": 1000,
    "count": 1,
    "description": "Замороженное счастье. Достаточно кинуть на сковородку, потушить 5-10 минут и готово",
    "guid": "cc87f70d-7570-42ee-a221-db8887534896",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-9/6012020949.jpg"
    ],
    "isFavorite": false,
    "isInCart": false,
    "name": "Бельгийская смесь \"Мираторг\"",
    "price": "149",
    "rating": 3.2,
    "weight": null
  },
  {
    "additionalParams": {},
    "availableCount": 10000000,
    "count": 654,
    "description": "Наш джем собственного приготовления. Наслаждайтесь!",
    "guid": "627de4ca-b4fd-46ea-9201-562448af6fc1",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-f/6199943655.jpg"
    ],
    "isFavorite": false,
    "isInCart": false,
    "name": "Джем Ozon Express",
    "price": "1390",
    "rating": 4.6,
    "weight": 0.15
  },
  {
    "additionalParams": {},
    "availableCount": 45,
    "count": 12,
    "description": "Новая линейка наивкуснейших мармеладов. Самые невероятные вкусы на планете",
    "guid": "493ef2ba-cd2f-4ca5-b3af-f9091115700e",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-z/6267606395.jpg"
    ],
    "isFavorite": true,
    "isInCart": false,
    "name": "Мармелад клюква с ягелем",
    "price": "319",
    "rating": 2.8,
    "weight": 1.2
  },
  {
    "additionalParams": {},
    "availableCount": 689,
    "count": 23,
    "description": "Солнечное авокадо из долины с ручьём",
    "guid": "ceadee7a-9d10-4987-8ed3-0624d6fbe5c0",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-8/6288053576.jpg"
    ],
    "isFavorite": false,
    "isInCart": false,
    "name": "Авокадо Хасс",
    "price": "600",
    "rating": 4.5,
    "weight": null
  },
  {
    "additionalParams": {
      "Высота": "90",
      "Ширина": "10",
      "Глубина": "10"
    },
    "availableCount": 90,
    "count": 23,
    "description": "Наше молоко вкуснее и дешевле любых аналогов на рынке",
    "guid": "c3cfe1a8-6eec-4e9f-a260-490e128763f4",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-4/6099200308.jpg"
    ],
    "isFavorite": true,
    "isInCart": false,
    "name": "Молоко",
    "price": "65",
    "rating": 5,
    "weight": 1
  },
  {
    "additionalParams": {},
    "availableCount": 874,
    "count": 3,
    "description": "Сорбет, это вам не молочное мороженое, от него не бывает аллергии",
    "guid": "a9cd4415-48b0-4557-8f29-6d28824fe91b",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-z/6096233435.jpg"
    ],
    "isFavorite": false,
    "isInCart": false,
    "name": "Мороженое сорбет",
    "price": "110",
    "rating": 4,
    "weight": 0.23
  },
  {
    "additionalParams": {
      "Вкус": "100",
      "Размер": "Слишком маленький",
      "Минусы": "нет"
    },
    "availableCount": 67456,
    "count": 99999,
    "description": "Обожаю эти сырки, они просто тают во рту, растекаясь по нёбу",
    "guid": "856c1c90-1b8e-46ba-a5de-bc818dc1bdbd",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-d/6206219785.jpg"
    ],
    "isFavorite": true,
    "isInCart": false,
    "name": "Сырок творожный",
    "price": "23",
    "rating": 5,
    "weight": 0.05
  },
  {
    "additionalParams": {
      "Температура": "50'c",
      "Количество в упаковке": "хотелось бы и побольше",
      "Начинка": "нет"
    },
    "availableCount": 9534,
    "count": 39167,
    "description": "Блинчики очень даже ничего. Ароматные, мягкие. Абсолютно достойны вашего внимания",
    "guid": "ebe799f5-6e01-45dc-8139-e714753896c1",
    "images": [
      "https://cdn1.ozone.ru/s3/multimedia-j/6167822191.jpg"
    ],
    "isFavorite": false,
    "isInCart": false,
    "name": "Блинчики домашние",
    "price": "189",
    "rating": 3,
    "weight": 0.22
  }
]""".trimIndent()

val dataMock = GsonBuilder().create().fromJson(mockData ,Array<ProductDTO>::class.java).toMutableList()