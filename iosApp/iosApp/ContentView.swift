import SwiftUI
import Shared

let products = [
    "Shoes",
    "Tshirt",
    "Watch",
    "Bag",
    "Jeans",
    "Jacket",
    "Sunglasses",
    "Wallet",
    "Belt",
    "Cap",
    "Sweater",
    "Hoodie",
    "Shorts",
    "Socks",
    "Formal Shirt",
    "Blazer",
    "Tie",
    "Kurta",
    "Sherwani",
    "Lehenga",
    "Saree",
    "Heels",
    "Sandals",
    "Slippers",
    "Boots",
    "Backpack",
    "Handbag",
    "Clutch",
    "Duffel Bag",
    "Laptop Bag",
    "Smartphone",
    "Laptop",
    "Tablet",
    "Smartwatch",
    "Headphones",
    "Earbuds",
    "Charger",
    "Power Bank",
    "Bluetooth Speaker",
    "Camera",
    "Tripod",
    "Gaming Console",
    "Keyboard",
    "Mouse",
    "Monitor",
    "Printer",
    "Desk Lamp",
    "Office Chair",
    "Water Bottle",
    "Coffee Mug",
    "Notebook",
    "Pen",
    "Perfume",
    "Deodorant",
    "Face Wash",
    "Shampoo",
    "Conditioner",
    "Body Lotion",
    "Sunscreen",
    "Makeup Kit",
    "Lipstick",
    "Foundation",
    "Nail Polish",
    "Hair Dryer",
    "Hair Straightener",
    "Towel",
    "Bedsheet",
    "Pillow",
    "Blanket",
    "Curtains",
    "Wall Clock",
    "Photo Frame",
    "Plant Pot",
    "Yoga Mat",
    "Dumbbells",
    "Skipping Rope",
    "Football",
    "Cricket Bat",
    "Badminton Racket",
    "Tennis Ball",
    "Travel Suitcase",
    "Passport Cover",
    "Lunch Box",
    "Cookware Set",
    "Frying Pan",
    "Knife Set",
    "Mixer Grinder",
    "Microwave",
    "Toaster",
    "Electric Kettle"
]

struct ContentView: View {
    @State private var count = 0
    var body: some View {
        ScrollView() {
        LazyVStack(alignment: .leading, spacing: 100) {
            ForEach(products, id: \.self) { item in
                Text("Count IS \(count) \n PRODUCT IS \(item)").onTapGesture {
                    count += 1;
                }
            }
        }.frame(maxWidth: .infinity)
        }.padding([.top, .bottom])
    }
}

