import SwiftUI
import Shared

struct ContentView: View {
    @State private var count = 0
    var body: some View {
        VStack(spacing: 50){
            Text("hello world, ios")
            Text("Helloooooooo \(count)").foregroundColor(Color(hex: 0xFF5733)).font(.system(size: 80, weight: .bold))
            Button("Click Me Text") {
                count -= 1
                print("Button Clicked")
            }
            Button(action: {
                count += 1
                print("Hello World Button Pressed")
            }) {
                    Text("Hello World").foregroundColor(Color(hex: 0xFFFFFF))
            }.buttonStyle(.plain)
            .frame(width: 100, height: 100)
            .background(Color.green)
            .foregroundColor(.white)
            .clipShape(RoundedRectangle(cornerRadius: 50))
        }.frame(maxWidth: .infinity, maxHeight: .infinity).background(Color(hex: 0xFF7821))
    }
}

