public class Fiction extends Book
    {
        public Fiction(String title)
        {
            super(title);
            setPrice();
        }

        @Override
        public void setPrice()
        {
            this.Price = 24.99;
        }
    }
