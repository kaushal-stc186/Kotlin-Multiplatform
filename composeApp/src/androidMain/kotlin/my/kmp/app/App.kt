package my.kmp.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import  androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog

val products = listOf("Running Shoes","Dress Shoes","Casual Sneakers","Sandals","Flip Flops","Hiking Boots","Trail Runners","Work Boots","Loafers","Oxford Shoes","Chelsea Boots","Ankle Boots","Soccer Cleats","Basketball Shoes","Boat Shoes","Slip-on Shoes","Espadrilles","Ballet Flats","Platform Shoes","Wedges","Men’s T-Shirt","Women’s T-Shirt","Long-Sleeve Shirt","Polo Shirt","Button-Down Shirt","Flannel Shirt","Dress Shirt","Blouse","Henley Shirt","Tank Top","Sweatshirt","Hoodie","Cardigan","Pullover Sweater","V-neck Sweater","Crewneck Sweater","Thermal Shirt","Compression Shirt","Graphic Tee","Tunic Top","Watch (Analog)","Watch (Digital)","Smartwatch","Fitness Tracker","Dress Watch","Dive Watch","Chronograph Watch","Pocket Watch","Watch Strap (Leather)","Watch Strap (Metal)","Leather Belt","Silk Tie","Bow Tie","Pocket Square","Cufflinks","Sunglasses (Aviator)","Sunglasses (Wayfarer)","Reading Glasses","Blue Light Glasses","Eyeglass Case","Baseball Cap","Beanie","Fedora","Sun Hat","Bucket Hat","Scarf (Wool)","Scarf (Silk)","Gloves (Leather)","Touchscreen Gloves","Raincoat","Trench Coat","Parka","Puffer Jacket","Windbreaker","Denim Jacket","Leather Jacket","Blazer","Suit Jacket","Suit Pants","Chinos","Jeans (Slim)","Jeans (Relaxed)","Shorts (Cargo)","Athletic Shorts","Swim Trunks","Swimwear (One-piece)","Bikini","Rash Guard","Leggings","Yoga Pants","Track Pants","Pajama Set","Robe","Undershirt","Boxer Briefs","Briefs","Sports Bra","Bra (T-shirt)","Lingerie Set","Socks (Crew)","No-show Socks","Compression Socks","Shoe Insoles","Foot Powder","Slippers","Tote Bag","Backpack","Messenger Bag","Duffel Bag","Laptop Sleeve","Briefcase","Wallet (Leather)","Card Holder","Passport Holder","Luggage (Carry-on)","Luggage (Checked)","Garment Bag","Cosmetic Bag","Makeup Organizer","Necklace (Pendant)","Necklace (Chain)","Bracelet (Charm)","Bangle Bracelet","Ring (Gold)","Ring (Silver)","Engagement Ring","Wedding Band","Brooch","Hair Clip","Headband","Hair Ties (Pack)","Hair Dryer","Straightener","Curling Iron","Electric Shaver","Beard Trimmer","Perfume (Women)","Cologne (Men)","Deodorant","Body Lotion","Face Moisturizer","Sunscreen","Face Cleanser")
@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxWidth().statusBarsPadding().navigationBarsPadding()
        ) {
            Text(text="Hello World", color = Color.Red, fontSize = 24.sp)
            Button(onClick = {
                println("Button Presses")
            }, shape = RoundedCornerShape(topEnd = 5.dp, topStart = 10.dp, bottomEnd = 15.dp, bottomStart = 20.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF000000),

            )) {
                Text(text = "Hello World", color = Color(0xFFFF5733))
            }
            LazyColumn {
                items(products) { item ->
                    Button(onClick = {
                        println("PRoduct presses $item")
                    }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = item)
                    }
                }
            }
        }

    }
}
