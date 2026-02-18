import SwiftUI
import Shared


struct ContentView: View {
    private let counterLogic = CounterLogic()
    @State private var counterState = CounterKt.defaultCounterState()
    var body: some View {
        Text("Counter is \(counterState.count)")
        Button(action: {
            counterState = counterLogic.dec(state: counterState)
        }) {
            Text("-")
        }.buttonStyle(.plain)

        Button(action: {
            counterState = counterLogic.inc(state: counterState)
        }) {
            Text("+")
        }.buttonStyle(.plain)
    }
}

