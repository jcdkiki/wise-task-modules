import ru.leti.wise.task.graph.util.FileLoader;
import ru.leti.wise.task.graph.model.Graph;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriangleCheckerTest {
	@Test
	public void triangleCheckerTest() throws FileNotFoundException {
    	TriangleChecker triangleChecker = new TriangleChecker();
		Graph graph;

		// graph = FileLoader.loadGraphFromJson("src/test/resources/directed_graph.json");
    	// assertThat(spiderGraphProperty.run(graph)).isFalse();
	}
}
