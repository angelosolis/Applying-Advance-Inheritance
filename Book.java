public abstract class Book
    {
        public abstract void setPrice();
        private String title;
        protected double Price;

        public Book(String title)
            {
                this.title = title;
            }

        public String gettitle()
            {
                return this.title;
            }

        public double getPrice()
            {
               return this.Price;
            }
    }
