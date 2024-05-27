-- Тип сделки
INSERT INTO type_of_deal(id, option_name) VALUES (1, 'продажа')
INSERT INTO type_of_deal(id, option_name) VALUES (2, 'аренда')


-- Тип недвижимости
INSERT INTO type_of_property(id, option_name) VALUES (1, 'квартира')
INSERT INTO type_of_property(id, option_name) VALUES (2, 'дом')
INSERT INTO type_of_property(id, option_name) VALUES (3, 'коммерческая недвижимость')
INSERT INTO type_of_property(id, option_name) VALUES (4, 'комната')
INSERT INTO type_of_property(id, option_name) VALUES (5, 'участок')
INSERT INTO type_of_property(id, option_name) VALUES (6, 'дача')
INSERT INTO type_of_property(id, option_name) VALUES (7, 'паркинг/гараж')


-- Количество комнат
INSERT INTO number_of_room(id, number_of_rooms) VALUES (1, 1)
INSERT INTO number_of_room(id, number_of_rooms) VALUES (2, 2)
INSERT INTO number_of_room(id, number_of_rooms) VALUES (3, 3)
INSERT INTO number_of_room(id, number_of_rooms) VALUES (4, 4)
INSERT INTO number_of_room(id, number_of_rooms) VALUES (5, 5)
INSERT INTO number_of_room(id, number_of_rooms) VALUES (6, 6)


-- Жилой комплекс
INSERT INTO residential_complex(id, option_name) VALUES (1, 'СМАРТ (SMART)')
INSERT INTO residential_complex(id, option_name) VALUES (2, 'Жилой комплекс "VENEZIAN"')
INSERT INTO residential_complex(id, option_name) VALUES (3, 'ЖК Миллион')


-- Серия
INSERT INTO series(id, option_name) VALUES (1, '102 серия')
INSERT INTO series(id, option_name) VALUES (2, '104 серия')
INSERT INTO series(id, option_name) VALUES (3, '104 серия(улучшенная)')
INSERT INTO series(id, option_name) VALUES (4, '105 серия')
INSERT INTO series(id, option_name) VALUES (5, '105 серия(улучшенная)')
INSERT INTO series(id, option_name) VALUES (6, '106 серия')
INSERT INTO series(id, option_name) VALUES (7, '106 серия(улучшенная)')
INSERT INTO series(id, option_name) VALUES (8, 'сталинка')
INSERT INTO series(id, option_name) VALUES (9, 'индивид.планировка')
INSERT INTO series(id, option_name) VALUES (10, 'элитка')
INSERT INTO series(id, option_name) VALUES (11, 'малосемейка')
INSERT INTO series(id, option_name) VALUES (12, 'пентхаус')
INSERT INTO series(id, option_name) VALUES (13, '108 серия')
INSERT INTO series(id, option_name) VALUES (14, '109 серия')


-- Тип строения
INSERT INTO type_of_building(id, option_name) VALUES (1, 'кирпичный')
INSERT INTO type_of_building(id, option_name) VALUES (2, 'панельный')
INSERT INTO type_of_building(id, option_name) VALUES (3, 'монолитный')


-- Отопление
INSERT INTO heating(id, option_name) VALUES (1, 'центральное')
INSERT INTO heating(id, option_name) VALUES (2, 'на газе')
INSERT INTO heating(id, option_name) VALUES (3, 'электрическое')
INSERT INTO heating(id, option_name) VALUES (4, 'смешанное')
INSERT INTO heating(id, option_name) VALUES (5, 'на твердом топливе')
INSERT INTO heating(id, option_name) VALUES (6, 'на жидком топливе')
INSERT INTO heating(id, option_name) VALUES (7, 'автономное')
INSERT INTO heating(id, option_name) VALUES (8, 'без отопления')


-- Состояние
INSERT INTO state(id, option_name) VALUES (1, 'Под самоотделку(ПСО)')
INSERT INTO state(id, option_name) VALUES (2, 'евроремонт')
INSERT INTO state(id, option_name) VALUES (3, 'хорошее')
INSERT INTO state(id, option_name) VALUES (4, 'среднее')
INSERT INTO state(id, option_name) VALUES (5, 'не достроено')


-- Цена
INSERT INTO price(id, option_name) VALUES (1, 'за все')
INSERT INTO price(id, option_name) VALUES (2, 'за м2')


-- Рассрочка
INSERT INTO payment_by_instalments(id, is_payment_by_instalment_available) VALUES (1, TRUE)
INSERT INTO payment_by_instalments(id, is_payment_by_instalment_available) VALUES (2, FALSE)


-- Ипотека
INSERT INTO Mortgage(id, mortgage_available) VALUES (1, TRUE)
INSERT INTO Mortgage(id, mortgage_available) VALUES (2, FALSE)


-- Возможность обмена
INSERT INTO possibility_of_exchange(id, option_name) VALUES (1, 'рассмотрю варианты')
INSERT INTO possibility_of_exchange(id, option_name) VALUES (2, 'с доплатой покупателя')
INSERT INTO possibility_of_exchange(id, option_name) VALUES (3, 'ключ на ключ')
INSERT INTO possibility_of_exchange(id, option_name) VALUES (4, 'обмен на авто')
