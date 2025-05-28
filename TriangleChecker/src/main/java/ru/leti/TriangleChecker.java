import ru.leti.wise.task.graph.model.Graph;
import ru.leti.wise.task.graph.model.Edge;
import ru.leti.wise.task.graph.model.Vertex;
import ru.leti.wise.task.plugin.graph.GraphProperty;

import java.util.*;

public class TriangleChecker implements GraphProperty {

    @Override
    public boolean run(Graph graph) {
        if (graph.isDirect() || graph.getVertexCount() < 3) {
            return false;
        }

        Map<Integer, Set<Integer>> adj = new HashMap<>();
        for (Vertex v : graph.getVertexList()) {
            adj.put(v.getId(), new HashSet<>());
        }
        for (Edge e : graph.getEdgeList()) {
            int s = e.getSource();
            int t = e.getTarget();
            adj.get(s).add(t);
            adj.get(t).add(s);
        }

        for (int v1 : adj.keySet()) {
            for (int v2 : adj.get(v1)) {
                if (v2 <= v1) continue;
                for (int v3 : adj.get(v2)) {
                    if (v3 > v2 && adj.get(v1).contains(v3)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
