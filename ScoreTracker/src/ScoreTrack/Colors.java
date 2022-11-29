package ScoreTrack;

import javafx.scene.paint.Color;

public enum Colors {
    BLACK{
        @Override
        public Color getColor() {
            return Color.BLACK;
        }
    }, RED{
        @Override
        public Color getColor() {
            return Color.RED;
        }
    }, PINK{
        @Override
        public Color getColor() {
            return Color.HOTPINK;
        }
    }, PURPLE{
        @Override
        public Color getColor() {
            return Color.PURPLE;
        }
    }, MAROON{
        @Override
        public Color getColor() {
            return Color.MAROON;
        }
    }, NAVY{
        @Override
        public Color getColor() {
            return Color.NAVY;
        }
    }, LIGHT_BLUE{
        @Override
        public Color getColor() {
            return Color.LIGHTSKYBLUE;
        }
    }, ROYAL_BLUE{
        @Override
        public Color getColor() {
            return Color.ROYALBLUE;
        }
    }, LIGHT_GREEN{
        @Override
        public Color getColor() {
            return Color.LIGHTGREEN;
        }
    }, DARK_GREEN{
        @Override
        public Color getColor() {
            return Color.DARKGREEN;
        }
    }, YELLOW{
        @Override
        public Color getColor() {
            return Color.LIGHTGOLDENRODYELLOW;
        }
    }, BROWN{
        @Override
        public Color getColor() {
            return Color.BROWN;
        }
    }, ORANGE{
        @Override
        public Color getColor() {
            return Color.ORANGE;
        }
    };
    abstract public Color getColor();

    }

