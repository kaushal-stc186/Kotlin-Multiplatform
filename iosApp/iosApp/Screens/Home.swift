import SwiftUI

struct Home: View {
    @EnvironmentObject var router: NavigationRouter

    var body: some View {
        VStack(spacing: 20) {
            Text("Home Screen")
                .font(.largeTitle)

            Button("Go to About") {
                router.navigate(.about)
            }

            Button("Open Contact") {
                router.navigate(.contact)
            }
        }
    }
}
