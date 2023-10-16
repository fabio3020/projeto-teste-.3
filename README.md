# projeto-teste-.3

classDiagram
    class Bank {
        - name: String
        - accountNumber: String
        - accountAgency: String
        - accountBalance: Double
        - accountLimit: Double
        - features: List<Feature>
        - card: Card
        - news: List<News>
    }
    
    class Feature {
        - icon: String
        - description: String
    }
    
    class Card {
        - Number: String
        - Limit: Double
    }
    
    class News {
        - icon: String
        - description: String
    }
    
    Bank --> Feature
    Bank --> Card
    Bank --> News
