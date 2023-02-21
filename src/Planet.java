public enum Planet {
        МЕРКУРИЙ("Меркурий"),
        ВЕНЕРА("Венера"),
        ЖЕР("Жер"),
        МАРС("Марс"),
        ЮПИТЕР("Жупитер"),
        САТУРН("Сатурн"),
        УРАН("Уран"),
        НЕПТУН("Нептун");

        private final String name;

        Planet(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


