# MoodMix API

Spring Boot backend for MoodMix application.

## Getting Started

1. Set your Spotify credentials in `src/main/resources/application.properties`
2. Run the application using `mvn spring-boot:run`
3. Access the API at `http://localhost:8080`

## Available Endpoints

- `GET /` - Home page
- `GET /api/spotify/credentials` - Get Spotify API credentials

## Docker Support

Build the image:
```bash
docker build -t moodmix-api .
```

Run the container:
```bash
docker run -p 8080:8080 \
  -e SPOTIFY_CLIENT_ID=your_spotify_client_id \
  -e SPOTIFY_CLIENT_SECRET=your_spotify_client_secret \
  -e SUPABASE_URL=your_supabase_url \
  -e SUPABASE_ANON_KEY=your_supabase_anon_key \
  moodmix-api
```

Note: Replace the environment variables with your actual credentials:
- `your_spotify_client_id`: Your Spotify API client ID
- `your_spotify_client_secret`: Your Spotify API client secret
- `your_supabase_url`: Your Supabase project URL
- `your_supabase_anon_key`: Your Supabase anonymous key
