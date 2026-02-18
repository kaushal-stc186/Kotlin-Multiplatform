import SwiftUI

class  NavigationRouter: ObservableObject {
    @Published var path: [Route] = []

    func navigate(_ route: Route) {
        path.append(route)
    }

    func goBack() {
        if !path.isEmpty {
            path.removeLast()
        }
    }

    func goHome() {
        path = []
    }
}