import SwiftUI

struct About: View {
    @EnvironmentObject var router: NavigationRouter

    var body: some View {
        VStack(spacing: 20) {
            Text("About Screen")
                .font(.largeTitle)

            Button("Go Home") {
                router.goHome()
            }

            Button("Open Contact") {
                router.navigate(.contact)
            }

            Button("Back") {
                router.goBack()
            }
        }
    }
}
