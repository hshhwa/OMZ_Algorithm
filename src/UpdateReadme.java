import java.io.*;
import java.nio.file.*;


// 문제풀이 갯수 업데이트 로직
public class UpdateReadme {
    public static void main(String[] args) {
        String basePath = "src"; // src 폴더 경로
        String readmePath = "README.md"; // README.md 파일 경로
        String markerStart = "<!-- 문제 풀이 현황 시작 -->"; // 시작 마커
        String markerEnd = "<!-- 문제 풀이 현황 끝 -->";   // 끝 마커

        File baseDir = new File(basePath);

        if (!baseDir.exists() || !baseDir.isDirectory()) {
            System.out.println("src 디렉토리가 존재하지 않습니다.");
            return;
        }

        StringBuilder problemContent = new StringBuilder();
        problemContent.append(markerStart).append("\n\n");
        int totalProblems = 0;

        // 각 폴더의 파일 개수를 계산
        for (File folder : baseDir.listFiles()) {
            if (folder.isDirectory()) {
                int fileCount = countFilesInFolder(folder);
                problemContent.append("- ").append(folder.getName()).append(": ").append(fileCount).append(" 문제\n");
                totalProblems += fileCount;
            }
        }

        problemContent.append("\n총 해결한 문제: ").append(totalProblems).append(" 문제\n\n");
        problemContent.append(markerEnd);

        try {
            // 기존 README.md 내용을 읽기
            File readmeFile = new File(readmePath);
            if (!readmeFile.exists()) {
                readmeFile.createNewFile();
            }
            String existingContent = Files.readString(readmeFile.toPath());

            // 기존 내용에서 마커 구간만 업데이트
            String updatedContent;
            int startIdx = existingContent.indexOf(markerStart);
            int endIdx = existingContent.indexOf(markerEnd) + markerEnd.length();

            if (startIdx != -1 && endIdx != -1) {
                // 마커 구간을 새 내용으로 대체
                updatedContent = existingContent.substring(0, startIdx) +
                        problemContent.toString() +
                        existingContent.substring(endIdx);
            } else {
                // 마커가 없으면 맨 아래에 새 내용 추가
                updatedContent = existingContent + "\n\n" + problemContent;
            }

            // README.md 업데이트
            Files.writeString(readmeFile.toPath(), updatedContent);
            System.out.println("README.md 업데이트 완료!");
        } catch (IOException e) {
            System.err.println("README.md 업데이트 중 오류 발생: " + e.getMessage());
        }
    }

    private static int countFilesInFolder(File folder) {
        int count = 0;
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                count++;
            }
        }
        return count;
    }
}
