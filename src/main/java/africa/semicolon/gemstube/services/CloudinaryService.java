package africa.semicolon.gemstube.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AppCloudService implements CloudService{
    @Override
    public String upload(MultipartFile multipartFile) {
        return null;
    }
}
