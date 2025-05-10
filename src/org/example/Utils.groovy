package org.example

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def buildApp() {
        steps.echo "🔨 Building app..."
    }

    def runTests() {
        steps.echo "✅ Running tests..."
    }
}
