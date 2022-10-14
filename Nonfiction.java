public class NonFiction extends Book
    {
        public NonFiction(String title)
        {
            super(title);
            setPrice();
        }

        @Override
        public void setPrice()
        {
            this.Price = 37.99;
        }
    }
