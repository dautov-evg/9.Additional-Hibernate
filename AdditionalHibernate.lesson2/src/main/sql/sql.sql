-- Просто дата без точного времени
ALTER TABLE Person ADD COLUMN date_of_birth DATE;
-- Точное время
-- Значение timestamp сохраняются в секундах до или после полуночи 1 января 2000 г.
ALTER TABLE Person ADD COLUMN created_at TIMESTAMP;