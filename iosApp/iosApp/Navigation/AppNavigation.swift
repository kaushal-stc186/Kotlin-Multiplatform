import SwiftUI

struct AppNavigation: View {
    @StateObject var router = NavigationRouter()

    var body: some View {
        NavigationStack(path: $router.path) {

            Home()
                .navigationDestination(for: Route.self) { route in
                    switch route {
                    case .home:
                        Home()

                    case .about:
                        About()

                    case .contact:
                        Contact()
                    }
                }
        }
        .environmentObject(router) // 🔥 inject globally
    }
}
