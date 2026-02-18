import SwiftUI

struct Contact: View {
    @EnvironmentObject var router: NavigationRouter

    var body: some View {
        VStack(spacing: 16) {
            Text("Contact Screen")
                .font(.largeTitle)
                .fontWeight(.bold)

            Button("Go Home") {
                router.navigate(.home)
            }
            .buttonStyle(.borderedProminent)

            Button("Open About") {
                router.navigate(.about)
            }
            .buttonStyle(.bordered)

            Spacer()
        }
        .padding()
        .navigationTitle("Contact")
        .navigationBarTitleDisplayMode(.inline)
    }
}
