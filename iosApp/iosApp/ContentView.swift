import SwiftUI
import Shared

struct ContentView: View {
    var body: some View {
        VStack(spacing: 50){
            Text("hello world, ios")
            Text("Helloooooooo").foregroundColor(Color(hex: 0xFF5733)).font(.system(size: 80, weight: .bold))
        }.frame(maxWidth: .infinity, maxHeight: .infinity).background(Color(hex: 0xFF7821))
    }
}

